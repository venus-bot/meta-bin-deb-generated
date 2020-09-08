PACKAGES = "${PN} x11-common"
PROVIDES = "x11-common"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/x/xorg/x11-common_7.7+19_all.deb;unpack=0;name=deb0\
"
DEBFILENAME_x11-common = "x11-common_7.7+19_all.deb"
SRC_URI[deb0.sha256sum] = "221b2e71e0e98b8cafa4fbc674b3fbe293db031c51d35570a3c8cdfb02a5a155"
SRC_URI[deb0.md5sum] = "a9ed942d2c36bfb9fd2f53708a4c18bd"

RDEPENDS_x11-common = "lsb-base (>= 1.3-9ubuntu2)"
DEPENDS = "lsb-base"


inherit deb_group

FILES_x11-common = " \
    ./etc/X11/Xreset \
    ./etc/X11/Xreset.d/README \
    ./etc/X11/Xresources/x11-common \
    ./etc/X11/Xsession \
    ./etc/X11/Xsession.d/20x11-common_process-args \
    ./etc/X11/Xsession.d/30x11-common_xresources \
    ./etc/X11/Xsession.d/35x11-common_xhost-local \
    ./etc/X11/Xsession.d/40x11-common_xsessionrc \
    ./etc/X11/Xsession.d/50x11-common_determine-startup \
    ./etc/X11/Xsession.d/90x11-common_ssh-agent \
    ./etc/X11/Xsession.d/99x11-common_start \
    ./etc/X11/Xsession.options \
    ./etc/X11/rgb.txt \
    ./etc/init.d/x11-common \
    ./usr/bin/X11 \
    ./usr/share/X11/rgb.txt \
    ./usr/share/doc/x11-common/NEWS.Debian.gz \
    ./usr/share/doc/x11-common/changelog.Debian.old.gz \
    ./usr/share/doc/x11-common/changelog.gz \
    ./usr/share/doc/x11-common/copyright \
    ./usr/share/lintian/overrides/x11-common \
    ./usr/share/man/man5/Xsession.5.gz \
    ./usr/share/man/man5/Xsession.options.5.gz\
"
