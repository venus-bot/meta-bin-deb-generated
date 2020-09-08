PACKAGES = "${PN} ucf"
PROVIDES = "ucf"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/u/ucf/ucf_3.0038+nmu1_all.deb;unpack=0;name=deb0\
"
DEBFILENAME_ucf = "ucf_3.0038+nmu1_all.deb"
SRC_URI[deb0.sha256sum] = "d02a82455faab988a52121f37d97c528a4f967ed75e9398e1d8db571398c12f9"
SRC_URI[deb0.md5sum] = "c08d9559adf8c1254e722a473cdaf8d8"

RDEPENDS_${PN} = "coreutils (>= 5.91) debconf (>= 1.5.19) sensible-utils"
DEPENDS = "coreutils debconf sensible-utils"


inherit deb_group

FILES_${PN} = " \
    ./etc/ucf.conf \
    ./usr/bin/lcf \
    ./usr/bin/ucf \
    ./usr/bin/ucfq \
    ./usr/bin/ucfr \
    ./usr/share/doc/ucf/changelog.gz \
    ./usr/share/doc/ucf/copyright \
    ./usr/share/doc/ucf/examples/postinst.gz \
    ./usr/share/doc/ucf/examples/postrm \
    ./usr/share/lintian/overrides/ucf \
    ./usr/share/man/man1/lcf.1.gz \
    ./usr/share/man/man1/ucf.1.gz \
    ./usr/share/man/man1/ucfq.1.gz \
    ./usr/share/man/man1/ucfr.1.gz \
    ./usr/share/man/man5/ucf.conf.5.gz\
"
