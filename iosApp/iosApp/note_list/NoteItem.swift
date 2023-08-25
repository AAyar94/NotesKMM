//
//  NoteItem.swift
//  iosApp
//
//  Created by Adem Ayar on 25.08.2023.
//  Copyright © 2023 orgName. All rights reserved.
//

import SwiftUI
import shared

struct NoteItem: View {
    var note: Note? = nil
    var onDeleteClick : () -> Void
    
    
    var body: some View {
        VStack(alignment: .leading) {
                    HStack {
                        Text(note!.title)
                            .font(.title3)
                            .fontWeight(.semibold)
                        Spacer()
                        Button(action: onDeleteClick) {
                            Image(systemName: "trash").foregroundColor(.black)
                        }
                    }.padding(.bottom, 3)
                    
            Text(note!.content)
                        .fontWeight(.light)
                        .padding(.bottom, 3)
                    
                    HStack {
                        Spacer()
                        Text(DateTimeUtil().formatNoteDate(dateTime: note!.created))
                            .font(.footnote)
                            .fontWeight(.light)
                    }
            }.padding()
            .background(Color(hex : note!.colorHex))
            .clipShape(RoundedRectangle(cornerRadius: 5))
    }
}

struct NoteItem_Previews: PreviewProvider {
    static var previews: some View {
        NoteItem(
            note:Note(
                id: nil,
                title: "My Note",
                content: "My content",
                colorHex: 0xFF2341,
                created:DateTimeUtil().now()),
            onDeleteClick: {
                
            }
        )
    }
}
