PACKAGES = "libxml2 libxml2-dev"
PROVIDES = "libxml2 libxml2-dev"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/libx/libxml2/libxml2_2.8.0+dfsg1-7+wheezy7_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/libx/libxml2/libxml2-dev_2.8.0+dfsg1-7+wheezy7_armhf.deb;unpack=0;name=deb1\
"
DEBFILENAME_libxml2 = "libxml2_2.8.0+dfsg1-7+wheezy7_armhf.deb"
SRC_URI[deb0.sha256sum] = "07b563b0ce5281e1fe54102b90fbdc049e7266f08474f6f0c67821a759770111"
SRC_URI[deb0.md5sum] = "f9b9ab805138fc6db3bee3894d923c35"
DEBFILENAME_libxml2-dev = "libxml2-dev_2.8.0+dfsg1-7+wheezy7_armhf.deb"
SRC_URI[deb1.sha256sum] = "97a64f57f5acbbe7833370a24375c98064f451ef56982cb9e1eaf26fe5b96578"
SRC_URI[deb1.md5sum] = "a1d0936b3843c273dbddd83df8466c21"

RDEPENDS_${PN} = "libc6 (>= 2.13-28) liblzma5 (>= 5.1.1alpha+20120614) zlib1g (>= 1:1.2.3.3)"
RDEPENDS_${PN}-dev = "libxml2 (= 2.8.0+dfsg1-7+wheezy7)"
DEPENDS = "liblzma5 zlib1g libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_${PN} = " \
	./usr/share/doc/libxml2/README \
	./usr/share/doc/libxml2/copyright \
	./usr/share/lintian/overrides/libxml2 \
	./usr/lib/arm-linux-gnueabihf/libxml2.so.2.8.0 \
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
