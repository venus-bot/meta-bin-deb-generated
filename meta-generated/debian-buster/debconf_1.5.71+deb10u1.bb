PACKAGES = "${PN} debconf"
PROVIDES = "debconf"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/d/debconf/debconf_1.5.71+deb10u1_all.deb;unpack=0;name=deb0\
"
DEBFILENAME_debconf = "debconf_1.5.71+deb10u1_all.deb"
SRC_URI[deb0.sha256sum] = "768387e57225fdc33ac24e94da8437303e0d52730a22bf38e4bbfa88ef5b6024"
SRC_URI[deb0.md5sum] = "61b2c3724a99ca490942e1da2c1aee9f"

RDEPENDS_${PN} = "perl-base (>= 5.20.1-3~)"
DEPENDS = "perl-base"


inherit deb_group

FILES_${PN} = " \
    ./etc/apt/apt.conf.d/70debconf \
    ./etc/debconf.conf \
    ./usr/bin/debconf \
    ./usr/bin/debconf-apt-progress \
    ./usr/bin/debconf-communicate \
    ./usr/bin/debconf-copydb \
    ./usr/bin/debconf-escape \
    ./usr/bin/debconf-set-selections \
    ./usr/bin/debconf-show \
    ./usr/sbin/dpkg-preconfigure \
    ./usr/sbin/dpkg-reconfigure \
    ./usr/share/bash-completion/completions/debconf \
    ./usr/share/bash-completion/completions/debconf-show \
    ./usr/share/debconf/confmodule \
    ./usr/share/debconf/confmodule.sh \
    ./usr/share/debconf/debconf.conf \
    ./usr/share/debconf/fix_db.pl \
    ./usr/share/debconf/frontend \
    ./usr/share/debconf/transition_db.pl \
    ./usr/share/doc/debconf/NEWS.Debian.gz \
    ./usr/share/doc/debconf/README.Debian \
    ./usr/share/doc/debconf/changelog.gz \
    ./usr/share/doc/debconf/copyright \
    ./usr/share/lintian/overrides/debconf \
    ./usr/share/man/man1/debconf-apt-progress.1.gz \
    ./usr/share/man/man1/debconf-communicate.1.gz \
    ./usr/share/man/man1/debconf-copydb.1.gz \
    ./usr/share/man/man1/debconf-escape.1.gz \
    ./usr/share/man/man1/debconf-set-selections.1.gz \
    ./usr/share/man/man1/debconf-show.1.gz \
    ./usr/share/man/man1/debconf.1.gz \
    ./usr/share/man/man8/dpkg-preconfigure.8.gz \
    ./usr/share/man/man8/dpkg-reconfigure.8.gz \
    ./usr/share/perl5/Debconf/AutoSelect.pm \
    ./usr/share/perl5/Debconf/Base.pm \
    ./usr/share/perl5/Debconf/Client/ConfModule.pm \
    ./usr/share/perl5/Debconf/ConfModule.pm \
    ./usr/share/perl5/Debconf/Config.pm \
    ./usr/share/perl5/Debconf/Db.pm \
    ./usr/share/perl5/Debconf/DbDriver.pm \
    ./usr/share/perl5/Debconf/DbDriver/Backup.pm \
    ./usr/share/perl5/Debconf/DbDriver/Cache.pm \
    ./usr/share/perl5/Debconf/DbDriver/Copy.pm \
    ./usr/share/perl5/Debconf/DbDriver/Debug.pm \
    ./usr/share/perl5/Debconf/DbDriver/DirTree.pm \
    ./usr/share/perl5/Debconf/DbDriver/Directory.pm \
    ./usr/share/perl5/Debconf/DbDriver/File.pm \
    ./usr/share/perl5/Debconf/DbDriver/LDAP.pm \
    ./usr/share/perl5/Debconf/DbDriver/PackageDir.pm \
    ./usr/share/perl5/Debconf/DbDriver/Pipe.pm \
    ./usr/share/perl5/Debconf/DbDriver/Stack.pm \
    ./usr/share/perl5/Debconf/Element.pm \
    ./usr/share/perl5/Debconf/Element/Dialog/Boolean.pm \
    ./usr/share/perl5/Debconf/Element/Dialog/Error.pm \
    ./usr/share/perl5/Debconf/Element/Dialog/Multiselect.pm \
    ./usr/share/perl5/Debconf/Element/Dialog/Note.pm \
    ./usr/share/perl5/Debconf/Element/Dialog/Password.pm \
    ./usr/share/perl5/Debconf/Element/Dialog/Progress.pm \
    ./usr/share/perl5/Debconf/Element/Dialog/Select.pm \
    ./usr/share/perl5/Debconf/Element/Dialog/String.pm \
    ./usr/share/perl5/Debconf/Element/Dialog/Text.pm \
    ./usr/share/perl5/Debconf/Element/Editor/Boolean.pm \
    ./usr/share/perl5/Debconf/Element/Editor/Error.pm \
    ./usr/share/perl5/Debconf/Element/Editor/Multiselect.pm \
    ./usr/share/perl5/Debconf/Element/Editor/Note.pm \
    ./usr/share/perl5/Debconf/Element/Editor/Password.pm \
    ./usr/share/perl5/Debconf/Element/Editor/Progress.pm \
    ./usr/share/perl5/Debconf/Element/Editor/Select.pm \
    ./usr/share/perl5/Debconf/Element/Editor/String.pm \
    ./usr/share/perl5/Debconf/Element/Editor/Text.pm \
    ./usr/share/perl5/Debconf/Element/Gnome.pm \
    ./usr/share/perl5/Debconf/Element/Gnome/Boolean.pm \
    ./usr/share/perl5/Debconf/Element/Gnome/Error.pm \
    ./usr/share/perl5/Debconf/Element/Gnome/Multiselect.pm \
    ./usr/share/perl5/Debconf/Element/Gnome/Note.pm \
    ./usr/share/perl5/Debconf/Element/Gnome/Password.pm \
    ./usr/share/perl5/Debconf/Element/Gnome/Progress.pm \
    ./usr/share/perl5/Debconf/Element/Gnome/Select.pm \
    ./usr/share/perl5/Debconf/Element/Gnome/String.pm \
    ./usr/share/perl5/Debconf/Element/Gnome/Text.pm \
    ./usr/share/perl5/Debconf/Element/Multiselect.pm \
    ./usr/share/perl5/Debconf/Element/Noninteractive.pm \
    ./usr/share/perl5/Debconf/Element/Noninteractive/Boolean.pm \
    ./usr/share/perl5/Debconf/Element/Noninteractive/Error.pm \
    ./usr/share/perl5/Debconf/Element/Noninteractive/Multiselect.pm \
    ./usr/share/perl5/Debconf/Element/Noninteractive/Note.pm \
    ./usr/share/perl5/Debconf/Element/Noninteractive/Password.pm \
    ./usr/share/perl5/Debconf/Element/Noninteractive/Progress.pm \
    ./usr/share/perl5/Debconf/Element/Noninteractive/Select.pm \
    ./usr/share/perl5/Debconf/Element/Noninteractive/String.pm \
    ./usr/share/perl5/Debconf/Element/Noninteractive/Text.pm \
    ./usr/share/perl5/Debconf/Element/Select.pm \
    ./usr/share/perl5/Debconf/Element/Teletype/Boolean.pm \
    ./usr/share/perl5/Debconf/Element/Teletype/Error.pm \
    ./usr/share/perl5/Debconf/Element/Teletype/Multiselect.pm \
    ./usr/share/perl5/Debconf/Element/Teletype/Note.pm \
    ./usr/share/perl5/Debconf/Element/Teletype/Password.pm \
    ./usr/share/perl5/Debconf/Element/Teletype/Progress.pm \
    ./usr/share/perl5/Debconf/Element/Teletype/Select.pm \
    ./usr/share/perl5/Debconf/Element/Teletype/String.pm \
    ./usr/share/perl5/Debconf/Element/Teletype/Text.pm \
    ./usr/share/perl5/Debconf/Element/Web/Boolean.pm \
    ./usr/share/perl5/Debconf/Element/Web/Error.pm \
    ./usr/share/perl5/Debconf/Element/Web/Multiselect.pm \
    ./usr/share/perl5/Debconf/Element/Web/Note.pm \
    ./usr/share/perl5/Debconf/Element/Web/Password.pm \
    ./usr/share/perl5/Debconf/Element/Web/Progress.pm \
    ./usr/share/perl5/Debconf/Element/Web/Select.pm \
    ./usr/share/perl5/Debconf/Element/Web/String.pm \
    ./usr/share/perl5/Debconf/Element/Web/Text.pm \
    ./usr/share/perl5/Debconf/Encoding.pm \
    ./usr/share/perl5/Debconf/Format.pm \
    ./usr/share/perl5/Debconf/Format/822.pm \
    ./usr/share/perl5/Debconf/FrontEnd.pm \
    ./usr/share/perl5/Debconf/FrontEnd/Dialog.pm \
    ./usr/share/perl5/Debconf/FrontEnd/Editor.pm \
    ./usr/share/perl5/Debconf/FrontEnd/Gnome.pm \
    ./usr/share/perl5/Debconf/FrontEnd/Kde.pm \
    ./usr/share/perl5/Debconf/FrontEnd/Noninteractive.pm \
    ./usr/share/perl5/Debconf/FrontEnd/Passthrough.pm \
    ./usr/share/perl5/Debconf/FrontEnd/Readline.pm \
    ./usr/share/perl5/Debconf/FrontEnd/ScreenSize.pm \
    ./usr/share/perl5/Debconf/FrontEnd/Teletype.pm \
    ./usr/share/perl5/Debconf/FrontEnd/Text.pm \
    ./usr/share/perl5/Debconf/FrontEnd/Web.pm \
    ./usr/share/perl5/Debconf/Gettext.pm \
    ./usr/share/perl5/Debconf/Iterator.pm \
    ./usr/share/perl5/Debconf/Log.pm \
    ./usr/share/perl5/Debconf/Path.pm \
    ./usr/share/perl5/Debconf/Priority.pm \
    ./usr/share/perl5/Debconf/Question.pm \
    ./usr/share/perl5/Debconf/Template.pm \
    ./usr/share/perl5/Debconf/Template/Transient.pm \
    ./usr/share/perl5/Debconf/TmpFile.pm \
    ./usr/share/perl5/Debian/DebConf/Client/ConfModule.pm \
    ./usr/share/pixmaps/debian-logo.png\
"
