outputPath = 'build'

inputPath = 'src/docs';

inputFiles = [
	[file: 'root.adoc', formats: ['html','pdf']]
]

imageDirs = [
	'images/.',
]

taskInputsDirs = [
                    "${inputPath}",
                 ]

taskInputsFiles = []

//*****************************************************************************************

confluence = [:]

confluence.with {
    input = [
            [ file: "build/html5/root.html",
              ancestorName: "docToolchain",
            ],
    ]
    subpagesForSections = 2


    api = 'https://<myconfluence.domain.com>/rest/api/'
    spaceKey = '<myspace>'

    pagePrefix = ''
    pageSuffix = ''
    pageVersionComment = ''
    enableAttachments = false
    pageLimit = 100
}

