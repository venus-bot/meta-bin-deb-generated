PACKAGES = "${PN} xorg-sgml-doctools"
PROVIDES = "xorg-sgml-doctools"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/x/xorg-sgml-doctools/xorg-sgml-doctools_1.11-1_all.deb;unpack=0;name=deb0\
"
DEBFILENAME_xorg-sgml-doctools = "xorg-sgml-doctools_1.11-1_all.deb"
SRC_URI[deb0.sha256sum] = "359dc76bf7b19fbbdb0b9e3ca3077e415b5b9ca8ff85162ccc889f9974493600"
SRC_URI[deb0.md5sum] = "f5db107a5b79df9f02f9e39c7b3bd14f"

RDEPENDS_${PN} = ""

inherit deb_group

FILES_${PN} = " \
    ./usr/share/doc/xorg-sgml-doctools/changelog.Debian.gz \
    ./usr/share/doc/xorg-sgml-doctools/changelog.gz \
    ./usr/share/doc/xorg-sgml-doctools/copyright \
    ./usr/share/pkgconfig/xorg-sgml-doctools.pc \
    ./usr/share/sgml/X11/dbs/masterdb.html.xml \
    ./usr/share/sgml/X11/dbs/masterdb.pdf.xml \
    ./usr/share/sgml/X11/defs.ent \
    ./usr/share/sgml/X11/xorg-chunk.xsl \
    ./usr/share/sgml/X11/xorg-fo.xsl \
    ./usr/share/sgml/X11/xorg-xhtml.xsl \
    ./usr/share/sgml/X11/xorg.css \
    ./usr/share/sgml/X11/xorg.xsl\
"
