PACKAGES = "xorg-sgml-doctools"
PROVIDES = "xorg-sgml-doctools"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/x/xorg-sgml-doctools/xorg-sgml-doctools_1.11-1_all.deb;unpack=0;name=deb0\
"
DEBFILENAME_xorg-sgml-doctools = "xorg-sgml-doctools_1.11-1_all.deb"
SRC_URI[deb0.sha256sum] = "359dc76bf7b19fbbdb0b9e3ca3077e415b5b9ca8ff85162ccc889f9974493600"
SRC_URI[deb0.md5sum] = "f5db107a5b79df9f02f9e39c7b3bd14f"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_${PN} = " \
	./usr/share/doc/xorg-sgml-doctools/changelog.Debian.gz \
	./usr/share/sgml/X11/defs.ent \
	./usr/share/sgml/X11/xorg.css \
	./usr/share/pkgconfig/xorg-sgml-doctools.pc \
	./usr/share/sgml/X11/dbs/masterdb.html.xml \
	./usr/share/sgml/X11/xorg-chunk.xsl \
	./usr/share/doc/xorg-sgml-doctools/changelog.gz \
	./usr/share/sgml/X11/xorg.xsl \
	./usr/share/sgml/X11/xorg-fo.xsl \
	./usr/share/sgml/X11/dbs/masterdb.pdf.xml \
	./usr/share/doc/xorg-sgml-doctools/copyright \
	./usr/share/sgml/X11/xorg-xhtml.xsl\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
