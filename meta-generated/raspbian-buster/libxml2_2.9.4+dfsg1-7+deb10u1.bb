PACKAGES = "${PN} libxml2 libxml2-dev"
PROVIDES = "libxml2 libxml2-dev"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/libx/libxml2/libxml2_2.9.4+dfsg1-7+deb10u1_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/libx/libxml2/libxml2-dev_2.9.4+dfsg1-7+deb10u1_armhf.deb;unpack=0;name=deb1\
"
DEBFILENAME_libxml2 = "libxml2_2.9.4+dfsg1-7+deb10u1_armhf.deb"
SRC_URI[deb0.sha256sum] = "2c20be379e96b05e8fad0f2ea1a2291450d673d4539183e7f7977a4e3138f577"
SRC_URI[deb0.md5sum] = "72e9649f556da3ffe2179f2fb2549362"
DEBFILENAME_libxml2-dev = "libxml2-dev_2.9.4+dfsg1-7+deb10u1_armhf.deb"
SRC_URI[deb1.sha256sum] = "e93095779b7447f6a27581e902b7ac2dcc22397dee3c2c92af7bd5e6c0f942da"
SRC_URI[deb1.md5sum] = "6fe75fe9ef5b5bf24ad521b833b64ae0"

RDEPENDS_${PN} = "libc6 (>= 2.28) libicu63 (>= 63.1-1~) liblzma5 (>= 5.1.1alpha+20120614) zlib1g (>= 1:1.2.3.3)"
RDEPENDS_${PN}-dev = "libicu-dev libxml2 (= 2.9.4+dfsg1-7+deb10u1)"
DEPENDS = "libc6 libicu-dev libicu63 liblzma5 zlib1g"


inherit deb_group

FILES_${PN} = " \
    ./usr/lib/arm-linux-gnueabihf/libxml2.so.2 \
    ./usr/lib/arm-linux-gnueabihf/libxml2.so.2.9.4 \
    ./usr/share/doc/libxml2/AUTHORS \
    ./usr/share/doc/libxml2/NEWS.gz \
    ./usr/share/doc/libxml2/README \
    ./usr/share/doc/libxml2/README.Debian \
    ./usr/share/doc/libxml2/changelog.Debian.gz \
    ./usr/share/doc/libxml2/changelog.gz \
    ./usr/share/doc/libxml2/copyright \
    ./usr/share/lintian/overrides/libxml2\
"
FILES_${PN}-dev = " \
    ./usr/bin/xml2-config \
    ./usr/include/libxml2/libxml/DOCBparser.h \
    ./usr/include/libxml2/libxml/HTMLparser.h \
    ./usr/include/libxml2/libxml/HTMLtree.h \
    ./usr/include/libxml2/libxml/SAX.h \
    ./usr/include/libxml2/libxml/SAX2.h \
    ./usr/include/libxml2/libxml/c14n.h \
    ./usr/include/libxml2/libxml/catalog.h \
    ./usr/include/libxml2/libxml/chvalid.h \
    ./usr/include/libxml2/libxml/debugXML.h \
    ./usr/include/libxml2/libxml/dict.h \
    ./usr/include/libxml2/libxml/encoding.h \
    ./usr/include/libxml2/libxml/entities.h \
    ./usr/include/libxml2/libxml/globals.h \
    ./usr/include/libxml2/libxml/hash.h \
    ./usr/include/libxml2/libxml/list.h \
    ./usr/include/libxml2/libxml/nanoftp.h \
    ./usr/include/libxml2/libxml/nanohttp.h \
    ./usr/include/libxml2/libxml/parser.h \
    ./usr/include/libxml2/libxml/parserInternals.h \
    ./usr/include/libxml2/libxml/pattern.h \
    ./usr/include/libxml2/libxml/relaxng.h \
    ./usr/include/libxml2/libxml/schemasInternals.h \
    ./usr/include/libxml2/libxml/schematron.h \
    ./usr/include/libxml2/libxml/threads.h \
    ./usr/include/libxml2/libxml/tree.h \
    ./usr/include/libxml2/libxml/uri.h \
    ./usr/include/libxml2/libxml/valid.h \
    ./usr/include/libxml2/libxml/xinclude.h \
    ./usr/include/libxml2/libxml/xlink.h \
    ./usr/include/libxml2/libxml/xmlIO.h \
    ./usr/include/libxml2/libxml/xmlautomata.h \
    ./usr/include/libxml2/libxml/xmlerror.h \
    ./usr/include/libxml2/libxml/xmlexports.h \
    ./usr/include/libxml2/libxml/xmlmemory.h \
    ./usr/include/libxml2/libxml/xmlmodule.h \
    ./usr/include/libxml2/libxml/xmlreader.h \
    ./usr/include/libxml2/libxml/xmlregexp.h \
    ./usr/include/libxml2/libxml/xmlsave.h \
    ./usr/include/libxml2/libxml/xmlschemas.h \
    ./usr/include/libxml2/libxml/xmlschemastypes.h \
    ./usr/include/libxml2/libxml/xmlstring.h \
    ./usr/include/libxml2/libxml/xmlunicode.h \
    ./usr/include/libxml2/libxml/xmlversion.h \
    ./usr/include/libxml2/libxml/xmlwriter.h \
    ./usr/include/libxml2/libxml/xpath.h \
    ./usr/include/libxml2/libxml/xpathInternals.h \
    ./usr/include/libxml2/libxml/xpointer.h \
    ./usr/lib/arm-linux-gnueabihf/libxml2.a \
    ./usr/lib/arm-linux-gnueabihf/libxml2.so \
    ./usr/lib/arm-linux-gnueabihf/pkgconfig/libxml-2.0.pc \
    ./usr/lib/arm-linux-gnueabihf/xml2Conf.sh \
    ./usr/share/aclocal/libxml2.m4 \
    ./usr/share/doc/libxml2-dev/NEWS.gz \
    ./usr/share/doc/libxml2-dev/changelog.Debian.gz \
    ./usr/share/doc/libxml2-dev/changelog.gz \
    ./usr/share/doc/libxml2-dev/copyright \
    ./usr/share/man/man1/xml2-config.1.gz \
    ./usr/share/man/man3/libxml.3.gz\
"
