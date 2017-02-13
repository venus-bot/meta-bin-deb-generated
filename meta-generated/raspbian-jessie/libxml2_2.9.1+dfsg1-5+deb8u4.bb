PACKAGES = "libxml2 libxml2-dev"
PROVIDES = "libxml2 libxml2-dev"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/libx/libxml2/libxml2_2.9.1+dfsg1-5+deb8u4_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/libx/libxml2/libxml2-dev_2.9.1+dfsg1-5+deb8u4_armhf.deb;unpack=0;name=deb1\
"
DEBFILENAME_libxml2 = "libxml2_2.9.1+dfsg1-5+deb8u4_armhf.deb"
SRC_URI[deb0.sha256sum] = "7993056a53e02fc69e0d2f287483bfcb85e6c37730a04f348c35f4087f5532c2"
SRC_URI[deb0.md5sum] = "b7d5029c5a03519fb800189a7be2ced7"
DEBFILENAME_libxml2-dev = "libxml2-dev_2.9.1+dfsg1-5+deb8u4_armhf.deb"
SRC_URI[deb1.sha256sum] = "8856a56c3e5d72926120e51e654185c95255dd006c31ce4505b029307521d71d"
SRC_URI[deb1.md5sum] = "1753f9fc8b82a6e601bd816b44fb4fb8"

RDEPENDS_${PN} = "libc6 (>= 2.15) liblzma5 (>= 5.1.1alpha+20120614) zlib1g (>= 1:1.2.3.3)"
RDEPENDS_${PN}-dev = "libxml2 (= 2.9.1+dfsg1-5+deb8u4)"
DEPENDS = "liblzma5 zlib1g libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_${PN} = " \
	./usr/share/doc/libxml2/README \
	./usr/lib/arm-linux-gnueabihf/libxml2.so.2.9.1 \
	./usr/share/doc/libxml2/copyright \
	./usr/share/lintian/overrides/libxml2 \
	./usr/share/doc/libxml2/AUTHORS \
	./usr/share/doc/libxml2/NEWS.gz \
	./usr/share/doc/libxml2/TODO.gz \
	./usr/share/doc/libxml2/changelog.Debian.gz \
	./usr/share/doc/libxml2/changelog.gz \
	./usr/share/doc/libxml2/README.Debian \
	./usr/lib/arm-linux-gnueabihf/libxml2.so.2\
"
FILES_${PN}-dev = " \
	./usr/include/libxml2/libxml/HTMLparser.h \
	./usr/include/libxml2/libxml/c14n.h \
	./usr/include/libxml2/libxml/xpointer.h \
	./usr/include/libxml2/libxml/chvalid.h \
	./usr/include/libxml2/libxml/xmlreader.h \
	./usr/include/libxml2/libxml/catalog.h \
	./usr/include/libxml2/libxml/xmlversion.h \
	./usr/include/libxml2/libxml/tree.h \
	./usr/bin/xml2-config \
	./usr/include/libxml2/libxml/encoding.h \
	./usr/include/libxml2/libxml/xmlerror.h \
	./usr/share/doc/libxml2-dev/copyright \
	./usr/include/libxml2/libxml/xmlIO.h \
	./usr/include/libxml2/libxml/xlink.h \
	./usr/include/libxml2/libxml/xmlstring.h \
	./usr/lib/arm-linux-gnueabihf/xml2Conf.sh \
	./usr/share/doc/libxml2-dev/AUTHORS \
	./usr/include/libxml2/libxml/globals.h \
	./usr/include/libxml2/libxml/threads.h \
	./usr/share/aclocal/libxml2.m4 \
	./usr/include/libxml2/libxml/xmlunicode.h \
	./usr/include/libxml2/libxml/xinclude.h \
	./usr/include/libxml2/libxml/valid.h \
	./usr/include/libxml2/libxml/debugXML.h \
	./usr/share/man/man3/libxml.3.gz \
	./usr/include/libxml2/libxml/xmlexports.h \
	./usr/include/libxml2/libxml/xmlautomata.h \
	./usr/include/libxml2/libxml/relaxng.h \
	./usr/lib/arm-linux-gnueabihf/pkgconfig/libxml-2.0.pc \
	./usr/include/libxml2/libxml/SAX.h \
	./usr/share/doc/libxml2-dev/README \
	./usr/include/libxml2/libxml/parserInternals.h \
	./usr/include/libxml2/libxml/nanoftp.h \
	./usr/include/libxml2/libxml/xmlsave.h \
	./usr/include/libxml2/libxml/hash.h \
	./usr/share/man/man1/xml2-config.1.gz \
	./usr/include/libxml2/libxml/xmlschemastypes.h \
	./usr/lib/arm-linux-gnueabihf/libxml2.a \
	./usr/include/libxml2/libxml/xmlregexp.h \
	./usr/include/libxml2/libxml/nanohttp.h \
	./usr/include/libxml2/libxml/pattern.h \
	./usr/include/libxml2/libxml/list.h \
	./usr/share/doc/libxml2-dev/changelog.Debian.gz \
	./usr/include/libxml2/libxml/xmlschemas.h \
	./usr/include/libxml2/libxml/entities.h \
	./usr/include/libxml2/libxml/SAX2.h \
	./usr/include/libxml2/libxml/DOCBparser.h \
	./usr/include/libxml2/libxml/HTMLtree.h \
	./usr/include/libxml2/libxml/xmlwriter.h \
	./usr/include/libxml2/libxml/uri.h \
	./usr/include/libxml2/libxml/xmlmemory.h \
	./usr/include/libxml2/libxml/schematron.h \
	./usr/include/libxml2/libxml/parser.h \
	./usr/share/doc/libxml2-dev/TODO.gz \
	./usr/share/doc/libxml2-dev/NEWS.gz \
	./usr/lib/arm-linux-gnueabihf/libxml2.so \
	./usr/include/libxml2/libxml/schemasInternals.h \
	./usr/include/libxml2/libxml/dict.h \
	./usr/include/libxml2/libxml/xpath.h \
	./usr/include/libxml2/libxml/xmlmodule.h \
	./usr/include/libxml2/libxml/xpathInternals.h\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
