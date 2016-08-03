PACKAGES = "libxml2 libxml2-dev"
PROVIDES = "libxml2 libxml2-dev"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/libx/libxml2/libxml2_2.9.1+dfsg1-5+deb8u1_armhf.deb;unpack=0;name=deb0\
	http://ftp.de.debian.org/debian/pool/main/libx/libxml2/libxml2-dev_2.9.1+dfsg1-5+deb8u1_armhf.deb;unpack=0;name=deb1\
"
DEBFILENAME_libxml2 = "libxml2_2.9.1+dfsg1-5+deb8u1_armhf.deb"
SRC_URI[deb0.sha256sum] = "49a3d1ef7e26e7dc58a45692e85ece9c9c95f69a62bd23b243c6fc8a3ffc62fb"
SRC_URI[deb0.md5sum] = "ad9af019970f21def72136ab1c2a1487"
DEBFILENAME_libxml2-dev = "libxml2-dev_2.9.1+dfsg1-5+deb8u1_armhf.deb"
SRC_URI[deb1.sha256sum] = "8cbfcac5da21aa48e02232960396632927e9812b9457e4f340e7385cc9d8b8a6"
SRC_URI[deb1.md5sum] = "892aa45adc0f16718e20c5399a83033f"

RDEPENDS_${PN} = "libc6 (>= 2.15) liblzma5 (>= 5.1.1alpha+20120614) zlib1g (>= 1:1.2.3.3)"
RDEPENDS_${PN}-dev = "libxml2 (= 2.9.1+dfsg1-5+deb8u1)"
DEPENDS = "liblzma5 zlib1g libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_${PN} = " \
	./usr/share/doc/libxml2/README \
	./usr/lib/arm-linux-gnueabihf/libxml2.so.2.9.1 \
	./usr/share/doc/libxml2/AUTHORS \
	./usr/share/doc/libxml2/copyright \
	./usr/share/lintian/overrides/libxml2 \
	./usr/share/doc/libxml2/changelog.gz \
	./usr/share/doc/libxml2/NEWS.gz \
	./usr/share/doc/libxml2/TODO.gz \
	./usr/share/doc/libxml2/changelog.Debian.gz \
	./usr/share/doc/libxml2/README.Debian \
	./usr/lib/arm-linux-gnueabihf/libxml2.so.2\
"
FILES_${PN}-dev = " \
	./usr/include/libxml2/libxml/HTMLparser.h \
	./usr/include/libxml2/libxml/c14n.h \
	./usr/include/libxml2/libxml/valid.h \
	./usr/include/libxml2/libxml/chvalid.h \
	./usr/include/libxml2/libxml/catalog.h \
	./usr/include/libxml2/libxml/xmlsave.h \
	./usr/include/libxml2/libxml/tree.h \
	./usr/share/man/man3/libxml.3.gz \
	./usr/include/libxml2/libxml/DOCBparser.h \
	./usr/include/libxml2/libxml/parserInternals.h \
	./usr/include/libxml2/libxml/xpointer.h \
	./usr/share/doc/libxml2-dev/copyright \
	./usr/include/libxml2/libxml/xmlIO.h \
	./usr/include/libxml2/libxml/entities.h \
	./usr/include/libxml2/libxml/xmlstring.h \
	./usr/lib/arm-linux-gnueabihf/xml2Conf.sh \
	./usr/share/doc/libxml2-dev/AUTHORS \
	./usr/include/libxml2/libxml/globals.h \
	./usr/include/libxml2/libxml/threads.h \
	./usr/share/aclocal/libxml2.m4 \
	./usr/include/libxml2/libxml/xmlunicode.h \
	./usr/include/libxml2/libxml/xinclude.h \
	./usr/include/libxml2/libxml/debugXML.h \
	./usr/include/libxml2/libxml/xmlreader.h \
	./usr/include/libxml2/libxml/xmlexports.h \
	./usr/include/libxml2/libxml/xmlautomata.h \
	./usr/include/libxml2/libxml/relaxng.h \
	./usr/lib/arm-linux-gnueabihf/pkgconfig/libxml-2.0.pc \
	./usr/include/libxml2/libxml/xmlwriter.h \
	./usr/share/doc/libxml2-dev/README \
	./usr/include/libxml2/libxml/xmlmodule.h \
	./usr/include/libxml2/libxml/nanoftp.h \
	./usr/include/libxml2/libxml/xmlversion.h \
	./usr/include/libxml2/libxml/hash.h \
	./usr/share/man/man1/xml2-config.1.gz \
	./usr/include/libxml2/libxml/xpathInternals.h \
	./usr/lib/arm-linux-gnueabihf/libxml2.a \
	./usr/include/libxml2/libxml/pattern.h \
	./usr/include/libxml2/libxml/nanohttp.h \
	./usr/include/libxml2/libxml/xmlregexp.h \
	./usr/include/libxml2/libxml/list.h \
	./usr/share/doc/libxml2-dev/changelog.Debian.gz \
	./usr/include/libxml2/libxml/xmlschemas.h \
	./usr/include/libxml2/libxml/xlink.h \
	./usr/include/libxml2/libxml/SAX2.h \
	./usr/include/libxml2/libxml/encoding.h \
	./usr/include/libxml2/libxml/HTMLtree.h \
	./usr/include/libxml2/libxml/uri.h \
	./usr/include/libxml2/libxml/xmlmemory.h \
	./usr/include/libxml2/libxml/schematron.h \
	./usr/include/libxml2/libxml/parser.h \
	./usr/include/libxml2/libxml/dict.h \
	./usr/share/doc/libxml2-dev/NEWS.gz \
	./usr/lib/arm-linux-gnueabihf/libxml2.so \
	./usr/bin/xml2-config \
	./usr/share/doc/libxml2-dev/TODO.gz \
	./usr/include/libxml2/libxml/xmlerror.h \
	./usr/include/libxml2/libxml/xpath.h \
	./usr/include/libxml2/libxml/schemasInternals.h \
	./usr/include/libxml2/libxml/xmlschemastypes.h \
	./usr/include/libxml2/libxml/SAX.h\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
