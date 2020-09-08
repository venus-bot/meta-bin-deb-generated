PACKAGES = "${PN} libxml2 libxml2-dev"
PROVIDES = "libxml2 libxml2-dev"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/libx/libxml2/libxml2_2.9.1+dfsg1-5+deb8u8_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/libx/libxml2/libxml2-dev_2.9.1+dfsg1-5+deb8u8_armhf.deb;unpack=0;name=deb1\
"
DEBFILENAME_libxml2 = "libxml2_2.9.1+dfsg1-5+deb8u8_armhf.deb"
SRC_URI[deb0.sha256sum] = "f1a3414dcbffa8c9730b1dc624e527d62602f60833ceebef01775423953f88b7"
SRC_URI[deb0.md5sum] = "c39143f87f38b1e7b1e4b239f7b0baf2"
DEBFILENAME_libxml2-dev = "libxml2-dev_2.9.1+dfsg1-5+deb8u8_armhf.deb"
SRC_URI[deb1.sha256sum] = "ec7bb49bd1249f44554abed7946d4acd2d1212c6e258aa524300f5433e09872f"
SRC_URI[deb1.md5sum] = "a04dd2e00857c2a7da58009e83406bcf"

RDEPENDS_${PN} = "libc6 (>= 2.15) liblzma5 (>= 5.1.1alpha+20120614) multiarch-support zlib1g (>= 1:1.2.3.3)"
RDEPENDS_${PN}-dev = "libxml2 (= 2.9.1+dfsg1-5+deb8u8)"
DEPENDS = "libc6 liblzma5 multiarch-support zlib1g"


inherit deb_group

FILES_${PN} = " \
    ./usr/lib/arm-linux-gnueabihf/libxml2.so.2 \
    ./usr/lib/arm-linux-gnueabihf/libxml2.so.2.9.1 \
    ./usr/share/doc/libxml2/AUTHORS \
    ./usr/share/doc/libxml2/NEWS.gz \
    ./usr/share/doc/libxml2/README \
    ./usr/share/doc/libxml2/README.Debian \
    ./usr/share/doc/libxml2/TODO.gz \
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
    ./usr/share/doc/libxml2-dev/AUTHORS \
    ./usr/share/doc/libxml2-dev/NEWS.gz \
    ./usr/share/doc/libxml2-dev/README \
    ./usr/share/doc/libxml2-dev/TODO.gz \
    ./usr/share/doc/libxml2-dev/changelog.Debian.gz \
    ./usr/share/doc/libxml2-dev/copyright \
    ./usr/share/man/man1/xml2-config.1.gz \
    ./usr/share/man/man3/libxml.3.gz\
"
